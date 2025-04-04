# Sử dụng Golang làm base image
FROM golang:1.20

# Thiết lập thư mục làm việc
WORKDIR /app

# Copy toàn bộ file vào container
COPY . .

# Tắt module
ENV GO111MODULE=off

# Biên dịch ứng dụng
RUN go build -o app

# Expose cổng 8080
EXPOSE 8080

# Chạy ứng dụng
CMD ["./app"]