package com.monash.erp.oms.party.security.service;

import com.monash.erp.oms.party.security.dto.SecurityGroupSummary;
import com.monash.erp.oms.party.security.dto.SecurityPermissionSummary;
import com.monash.erp.oms.party.security.dto.UserCreateRequest;
import com.monash.erp.oms.party.security.dto.UserDetail;
import com.monash.erp.oms.party.security.dto.UserDetailResponse;
import com.monash.erp.oms.party.security.dto.UserListResponse;
import com.monash.erp.oms.party.security.dto.UserProfile;
import com.monash.erp.oms.party.security.dto.UserSummary;
import com.monash.erp.oms.party.security.dto.UserUpdateRequest;
import com.monash.erp.oms.party.entity.Party;
import com.monash.erp.oms.party.entity.Person;
import com.monash.erp.oms.party.repository.PartyRepository;
import com.monash.erp.oms.party.repository.PersonRepository;
import com.monash.erp.oms.party.security.entity.SecurityGroup;
import com.monash.erp.oms.party.security.entity.SecurityGroupPermission;
import com.monash.erp.oms.party.security.entity.SecurityPermission;
import com.monash.erp.oms.party.security.entity.UserLogin;
import com.monash.erp.oms.party.security.entity.UserLoginSecurityGroup;
import com.monash.erp.oms.party.security.repository.SecurityGroupPermissionRepository;
import com.monash.erp.oms.party.security.repository.SecurityGroupRepository;
import com.monash.erp.oms.party.security.repository.SecurityPermissionRepository;
import com.monash.erp.oms.party.security.repository.UserLoginRepository;
import com.monash.erp.oms.party.security.repository.UserLoginSecurityGroupRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserManagementService {

    private static final String PERMISSION_GROUP_PREFIX = "USR_";

    private final UserLoginRepository userLoginRepository;
    private final UserLoginSecurityGroupRepository userLoginSecurityGroupRepository;
    private final SecurityGroupRepository securityGroupRepository;
    private final SecurityPermissionRepository securityPermissionRepository;
    private final SecurityGroupPermissionRepository securityGroupPermissionRepository;
    private final PasswordEncoder passwordEncoder;
    private final PartyRepository partyRepository;
    private final PersonRepository personRepository;

    public UserManagementService(UserLoginRepository userLoginRepository,
                                 UserLoginSecurityGroupRepository userLoginSecurityGroupRepository,
                                 SecurityGroupRepository securityGroupRepository,
                                 SecurityPermissionRepository securityPermissionRepository,
                                 SecurityGroupPermissionRepository securityGroupPermissionRepository,
                                 PasswordEncoder passwordEncoder,
                                 PartyRepository partyRepository,
                                 PersonRepository personRepository) {
        this.userLoginRepository = userLoginRepository;
        this.userLoginSecurityGroupRepository = userLoginSecurityGroupRepository;
        this.securityGroupRepository = securityGroupRepository;
        this.securityPermissionRepository = securityPermissionRepository;
        this.securityGroupPermissionRepository = securityGroupPermissionRepository;
        this.passwordEncoder = passwordEncoder;
        this.partyRepository = partyRepository;
        this.personRepository = personRepository;
    }

    @Transactional(readOnly = true)
    public UserListResponse listUsers(int page, int pageSize, String query, String sortBy, String sortDirection) {
        Sort sort = buildSort(sortBy, sortDirection);
        PageRequest pageRequest = PageRequest.of(page, pageSize, sort);
        Page<UserLogin> userPage;
        if (StringUtils.hasText(query)) {
            userPage = userLoginRepository.findByUserLoginIdContainingIgnoreCaseOrPartyIdContainingIgnoreCase(
                    query,
                    query,
                    pageRequest
            );
        } else {
            userPage = userLoginRepository.findAll(pageRequest);
        }

        List<UserLogin> users = userPage.getContent();
        if (users.isEmpty()) {
            return new UserListResponse(List.of(), userPage.getTotalElements());
        }

        List<String> userLoginIds = users.stream()
                .map(UserLogin::getUserLoginId)
                .filter(StringUtils::hasText)
                .toList();

        Map<String, List<UserLoginSecurityGroup>> assignmentsByUser = userLoginSecurityGroupRepository
                .findByUserLoginIdIn(userLoginIds)
                .stream()
                .collect(Collectors.groupingBy(UserLoginSecurityGroup::getUserLoginId));

        Set<String> roleGroupIds = new HashSet<>();
        for (UserLogin user : users) {
            String permissionGroupId = permissionGroupId(user);
            List<UserLoginSecurityGroup> groups = assignmentsByUser.getOrDefault(user.getUserLoginId(), List.of());
            for (UserLoginSecurityGroup assignment : groups) {
                String groupId = assignment.getGroupId();
                if (StringUtils.hasText(groupId) && !groupId.equals(permissionGroupId)) {
                    roleGroupIds.add(groupId);
                }
            }
        }

        Map<String, SecurityGroupSummary> groupSummaryById = toGroupSummaryMap(roleGroupIds);
        List<UserSummary> resultList = new ArrayList<>();
        for (UserLogin user : users) {
            List<UserLoginSecurityGroup> groups = assignmentsByUser.getOrDefault(user.getUserLoginId(), List.of());
            String permissionGroupId = permissionGroupId(user);
            List<SecurityGroupSummary> roles = groups.stream()
                    .map(UserLoginSecurityGroup::getGroupId)
                    .filter(StringUtils::hasText)
                    .filter(groupId -> !groupId.equals(permissionGroupId))
                    .map(groupId -> groupSummaryById.getOrDefault(groupId, new SecurityGroupSummary(groupId, groupId)))
                    .toList();
            resultList.add(new UserSummary(user.getUserLoginId(), user.getPartyId(), user.getEnabled(), roles));
        }

        return new UserListResponse(resultList, userPage.getTotalElements());
    }

    @Transactional(readOnly = true)
    public UserDetailResponse getUser(String userLoginId) {
        UserLogin userLogin = userLoginRepository.findByUserLoginId(userLoginId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User %s not found".formatted(userLoginId)));
        return new UserDetailResponse(buildUserDetail(userLogin));
    }

    @Transactional
    public UserDetailResponse createUser(UserCreateRequest request) {
        if (!StringUtils.hasText(request.getUserLoginId()) || !StringUtils.hasText(request.getPassword())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User login id and password are required");
        }
        if (userLoginRepository.existsByUserLoginId(request.getUserLoginId())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "User already exists");
        }

        String partyId = StringUtils.hasText(request.getPartyId()) ? request.getPartyId() : request.getUserLoginId();
        createPartyAndPerson(partyId, request.getFirstName(), request.getLastName());

        UserLogin userLogin = new UserLogin();
        userLogin.setUserLoginId(request.getUserLoginId());
        userLogin.setPartyId(partyId);
        userLogin.setEnabled(Optional.ofNullable(request.getEnabled()).orElse(true));
        userLogin.setRequirePasswordChange(Optional.ofNullable(request.getRequirePasswordChange()).orElse(false));
        userLogin.setCurrentPassword(passwordEncoder.encode(request.getPassword()));
        userLogin = userLoginRepository.save(userLogin);

        applyRoleAssignments(userLogin, request.getRoleIds());
        applyPermissionAssignments(userLogin, request.getPermissionIds());

        return new UserDetailResponse(buildUserDetail(userLogin));
    }

    @Transactional
    public UserDetailResponse updateUser(String userLoginId, UserUpdateRequest request) {
        UserLogin userLogin = userLoginRepository.findByUserLoginId(userLoginId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User %s not found".formatted(userLoginId)));

        if (StringUtils.hasText(request.getPassword())) {
            userLogin.setCurrentPassword(passwordEncoder.encode(request.getPassword()));
        }
        String existingPartyId = userLogin.getPartyId();
        String desiredPartyId = StringUtils.hasText(request.getPartyId()) ? request.getPartyId() : existingPartyId;
        if (!StringUtils.hasText(desiredPartyId) &&
                (StringUtils.hasText(request.getFirstName()) || StringUtils.hasText(request.getLastName()))) {
            desiredPartyId = userLogin.getUserLoginId();
            createPartyAndPerson(desiredPartyId, request.getFirstName(), request.getLastName());
        }
        if (StringUtils.hasText(desiredPartyId)) {
            userLogin.setPartyId(desiredPartyId);
        }
        if (request.getEnabled() != null) {
            userLogin.setEnabled(request.getEnabled());
        }
        if (request.getRequirePasswordChange() != null) {
            userLogin.setRequirePasswordChange(request.getRequirePasswordChange());
        }

        userLoginRepository.save(userLogin);

        if (StringUtils.hasText(userLogin.getPartyId()) &&
                (StringUtils.hasText(request.getFirstName()) || StringUtils.hasText(request.getLastName()))) {
            upsertPerson(userLogin.getPartyId(), request.getFirstName(), request.getLastName());
        }

        if (request.getRoleIds() != null) {
            applyRoleAssignments(userLogin, request.getRoleIds());
        }
        if (request.getPermissionIds() != null) {
            applyPermissionAssignments(userLogin, request.getPermissionIds());
        }

        return new UserDetailResponse(buildUserDetail(userLogin));
    }

    @Transactional
    public void deleteUser(String userLoginId) {
        UserLogin userLogin = userLoginRepository.findByUserLoginId(userLoginId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User %s not found".formatted(userLoginId)));
        String permissionGroupId = permissionGroupId(userLogin);

        userLoginSecurityGroupRepository.deleteByUserLoginId(userLoginId);
        securityGroupPermissionRepository.deleteByGroupId(permissionGroupId);
        securityGroupRepository.findByGroupId(permissionGroupId).ifPresent(securityGroupRepository::delete);
        userLoginRepository.delete(userLogin);
    }

    private void applyRoleAssignments(UserLogin userLogin, List<String> roleIds) {
        String permissionGroupId = permissionGroupId(userLogin);
        List<UserLoginSecurityGroup> existing = userLoginSecurityGroupRepository.findByUserLoginId(userLogin.getUserLoginId());
        List<UserLoginSecurityGroup> toDelete = existing.stream()
                .filter(group -> group.getGroupId() != null && !group.getGroupId().equals(permissionGroupId))
                .toList();
        if (!toDelete.isEmpty()) {
            userLoginSecurityGroupRepository.deleteAll(toDelete);
        }

        List<String> cleanedRoleIds = cleanIds(roleIds);
        if (cleanedRoleIds.isEmpty()) {
            return;
        }

        LocalDateTime now = LocalDateTime.now();
        List<UserLoginSecurityGroup> assignments = cleanedRoleIds.stream()
                .map(roleId -> newUserLoginSecurityGroup(userLogin.getUserLoginId(), roleId, now))
                .toList();
        userLoginSecurityGroupRepository.saveAll(assignments);
    }

    private void applyPermissionAssignments(UserLogin userLogin, List<String> permissionIds) {
        List<String> cleanedPermissionIds = cleanIds(permissionIds);
        String permissionGroupId = permissionGroupId(userLogin);

        if (cleanedPermissionIds.isEmpty()) {
            securityGroupPermissionRepository.deleteByGroupId(permissionGroupId);
            userLoginSecurityGroupRepository.deleteByUserLoginIdAndGroupId(userLogin.getUserLoginId(), permissionGroupId);
            securityGroupRepository.findByGroupId(permissionGroupId).ifPresent(securityGroupRepository::delete);
            return;
        }

        SecurityGroup permissionGroup = securityGroupRepository.findByGroupId(permissionGroupId)
                .orElseGet(() -> createPermissionGroup(permissionGroupId, userLogin.getUserLoginId()));

        ensureUserInGroup(userLogin, permissionGroup.getGroupId());

        List<String> allowedPermissionIds = resolvePermissionIds(cleanedPermissionIds);
        securityGroupPermissionRepository.deleteByGroupId(permissionGroup.getGroupId());

        LocalDateTime now = LocalDateTime.now();
        List<SecurityGroupPermission> permissions = allowedPermissionIds.stream()
                .map(permissionId -> newGroupPermission(permissionGroup.getGroupId(), permissionId, now))
                .toList();
        securityGroupPermissionRepository.saveAll(permissions);
    }

    private SecurityGroup createPermissionGroup(String groupId, String userLoginId) {
        SecurityGroup group = new SecurityGroup();
        group.setGroupId(groupId);
        group.setGroupName("User Permissions");
        group.setDescription("Permissions for user " + userLoginId);
        return securityGroupRepository.save(group);
    }

    private void ensureUserInGroup(UserLogin userLogin, String groupId) {
        List<UserLoginSecurityGroup> existing = userLoginSecurityGroupRepository.findByUserLoginId(userLogin.getUserLoginId());
        boolean assigned = existing.stream().anyMatch(group -> groupId.equals(group.getGroupId()));
        if (!assigned) {
            userLoginSecurityGroupRepository.save(newUserLoginSecurityGroup(userLogin.getUserLoginId(), groupId, LocalDateTime.now()));
        }
    }

    private UserDetail buildUserDetail(UserLogin userLogin) {
        String permissionGroupId = permissionGroupId(userLogin);
        List<UserLoginSecurityGroup> assignments = userLoginSecurityGroupRepository.findByUserLoginId(userLogin.getUserLoginId());

        List<String> roleGroupIds = assignments.stream()
                .map(UserLoginSecurityGroup::getGroupId)
                .filter(StringUtils::hasText)
                .filter(groupId -> !groupId.equals(permissionGroupId))
                .toList();

        Map<String, SecurityGroupSummary> groupSummaryById = toGroupSummaryMap(roleGroupIds);
        List<SecurityGroupSummary> roles = roleGroupIds.stream()
                .map(groupId -> groupSummaryById.getOrDefault(groupId, new SecurityGroupSummary(groupId, groupId)))
                .toList();

        List<SecurityPermissionSummary> permissions = resolvePermissionSummaries(permissionGroupId);

        Person person = null;
        if (StringUtils.hasText(userLogin.getPartyId())) {
            person = personRepository.findByPartyId(userLogin.getPartyId()).orElse(null);
        }

        UserProfile profile = new UserProfile(
                userLogin.getUserLoginId(),
                userLogin.getPartyId(),
                person != null ? person.getFirstName() : null,
                person != null ? person.getLastName() : null,
                userLogin.getEnabled(),
                userLogin.getRequirePasswordChange(),
                userLogin.getIsSystem(),
                userLogin.getDisabledDateTime()
        );

        return new UserDetail(profile, roles, permissions);
    }

    private Map<String, SecurityGroupSummary> toGroupSummaryMap(Collection<String> groupIds) {
        if (groupIds == null || groupIds.isEmpty()) {
            return Collections.emptyMap();
        }
        List<SecurityGroup> groups = securityGroupRepository.findByGroupIdIn(new ArrayList<>(groupIds));
        Map<String, SecurityGroupSummary> summaryMap = new HashMap<>();
        for (SecurityGroup group : groups) {
            summaryMap.put(group.getGroupId(), new SecurityGroupSummary(group.getGroupId(), group.getGroupName()));
        }
        return summaryMap;
    }

    private List<SecurityPermissionSummary> resolvePermissionSummaries(String permissionGroupId) {
        if (!StringUtils.hasText(permissionGroupId)) {
            return List.of();
        }
        List<SecurityGroupPermission> groupPermissions = securityGroupPermissionRepository.findByGroupId(permissionGroupId);
        if (groupPermissions.isEmpty()) {
            return List.of();
        }
        List<String> permissionIds = groupPermissions.stream()
                .map(SecurityGroupPermission::getPermissionId)
                .filter(StringUtils::hasText)
                .distinct()
                .toList();
        if (permissionIds.isEmpty()) {
            return List.of();
        }

        Map<String, SecurityPermission> permissionById = securityPermissionRepository.findByPermissionIdIn(permissionIds).stream()
                .collect(Collectors.toMap(SecurityPermission::getPermissionId, permission -> permission));

        List<SecurityPermissionSummary> summaries = new ArrayList<>();
        for (String permissionId : permissionIds) {
            SecurityPermission permission = permissionById.get(permissionId);
            summaries.add(new SecurityPermissionSummary(permissionId, permission != null ? permission.getDescription() : permissionId));
        }
        return summaries;
    }

    private List<String> resolvePermissionIds(List<String> permissionIds) {
        if (permissionIds == null || permissionIds.isEmpty()) {
            return List.of();
        }
        List<SecurityPermission> permissions = securityPermissionRepository.findByPermissionIdIn(permissionIds);
        Set<String> allowed = permissions.stream()
                .map(SecurityPermission::getPermissionId)
                .collect(Collectors.toSet());
        return permissionIds.stream()
                .filter(allowed::contains)
                .distinct()
                .toList();
    }

    private UserLoginSecurityGroup newUserLoginSecurityGroup(String userLoginId, String groupId, LocalDateTime now) {
        UserLoginSecurityGroup group = new UserLoginSecurityGroup();
        group.setUserLoginId(userLoginId);
        group.setGroupId(groupId);
        group.setFromDate(now);
        return group;
    }

    private SecurityGroupPermission newGroupPermission(String groupId, String permissionId, LocalDateTime now) {
        SecurityGroupPermission permission = new SecurityGroupPermission();
        permission.setGroupId(groupId);
        permission.setPermissionId(permissionId);
        permission.setFromDate(now);
        return permission;
    }

    private String permissionGroupId(UserLogin userLogin) {
        if (userLogin.getId() == null) {
            return null;
        }
        return PERMISSION_GROUP_PREFIX + userLogin.getId();
    }

    private List<String> cleanIds(List<String> ids) {
        if (ids == null) {
            return List.of();
        }
        return ids.stream()
                .filter(StringUtils::hasText)
                .map(String::trim)
                .filter(StringUtils::hasText)
                .distinct()
                .toList();
    }

    private Sort buildSort(String sortBy, String sortDirection) {
        String sortField;
        if ("partyId".equalsIgnoreCase(sortBy)) {
            sortField = "partyId";
        } else if ("enabled".equalsIgnoreCase(sortBy)) {
            sortField = "enabled";
        } else {
            sortField = "userLoginId";
        }

        Sort.Direction direction = "desc".equalsIgnoreCase(sortDirection)
                ? Sort.Direction.DESC
                : Sort.Direction.ASC;
        return Sort.by(direction, sortField);
    }

    private void createPartyAndPerson(String partyId, String firstName, String lastName) {
        if (!StringUtils.hasText(partyId)) {
            return;
        }
        if (partyRepository.findByPartyId(partyId).isPresent()) {
            return;
        }
        Party party = new Party();
        party.setPartyId(partyId);
        party.setPartyTypeId("PERSON");
        partyRepository.save(party);

        if (StringUtils.hasText(firstName) || StringUtils.hasText(lastName)) {
            Person person = new Person();
            person.setPartyId(partyId);
            person.setFirstName(firstName);
            person.setLastName(lastName);
            personRepository.save(person);
        }
    }

    private void upsertPerson(String partyId, String firstName, String lastName) {
        Person person = personRepository.findByPartyId(partyId).orElseGet(() -> {
            Person created = new Person();
            created.setPartyId(partyId);
            return created;
        });
        if (StringUtils.hasText(firstName)) {
            person.setFirstName(firstName);
        }
        if (StringUtils.hasText(lastName)) {
            person.setLastName(lastName);
        }
        personRepository.save(person);
    }
}
