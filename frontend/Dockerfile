# Stage 1: Build the Angular app
FROM node:22.12.0 AS build
WORKDIR /app
COPY package*.json ./
RUN npm ci
COPY . .
RUN npm run build -- --configuration production

# Stage 2: Serve the app using Nginx
FROM nginx:alpine
COPY --from=build /app/dist/erp /usr/share/nginx/html
COPY nginx.conf /etc/nginx/conf.d/default.conf
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
