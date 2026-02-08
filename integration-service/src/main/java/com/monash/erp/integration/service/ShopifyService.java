package com.monash.erp.integration.service;

import com.monash.erp.integration.config.ShopifyConfig;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.http.MediaType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ShopifyService {

    private final RestClient restClient;
    private final ShopifyConfig config;

    public ShopifyService(ShopifyConfig config, RestClient.Builder restClientBuilder) {
        this.config = config;
        this.restClient = restClientBuilder
                .baseUrl("https://" + config.getShopDomain() + "/admin/api/2024-01")
                .defaultHeader("X-Shopify-Access-Token", config.getAccessToken())
                .build();
    }

    public void runBulkQuery() {
        String query = """
            mutation {
              bulkOperationRunQuery(
                query: \"\"\"
                {
                  products {
                    edges {
                      node {
                        id
                        title
                        descriptionHtml
                        variants {
                          edges {
                            node {
                              sku
                              price
                              inventoryQuantity
                            }
                          }
                        }
                      }
                    }
                  }
                }
                \"\"\"
              ) {
                bulkOperation {
                  id
                  status
                }
                userErrors {
                  field
                  message
                }
              }
            }
            """;
        
        log.info("Triggering Bulk Operation with query...");
        
        String response = restClient.post()
                .uri("/graphql.json")
                .contentType(MediaType.APPLICATION_JSON)
                .body(query)
                .retrieve()
                .body(String.class);
                
        log.info("Bulk Operation Response: {}", response);
    }
}
