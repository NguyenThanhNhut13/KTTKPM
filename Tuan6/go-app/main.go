package main

import (
	"fmt"
	"net/http"
)

func handler (w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w, "Hello, Docker Go!")
	fmt.Fprintf(w, "21140001 - Nguyễn Thanh Nhứt")
}

func main() {
	http.HandleFunc("/", handler)
	fmt.Println("Server is running on port 8080")
	http.ListenAndServe(":8080", nil)
}
