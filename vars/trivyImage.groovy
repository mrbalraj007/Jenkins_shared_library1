def call() {
    sh 'trivy image balrajsi/youtube:latest > trivyimage.txt'
}