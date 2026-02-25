pipeline{
    agent any

    enviroment {
        DOCKER_IMAGE = "abkaplesh02/java-devops-app"
        VERSION="v2"
    }

    stages{

        stage('Clone Repo'){
            steps{
                checkout scm
            }
        }

        stage('Build Docker Image'){
            steps{
                sh 'docker build -t $DOCKER_IMAGE:$VERSION'
            }
        }

        stage('Push Docker Image'){
            steps{
                sh 'docker push $DOCKER_IMAGE:$VERSION'
            }
        }

        stage('Deploy to kubernetes'){
            steps{
                sh 'kubectl apply -f k8s-configmap.yaml'
                sh 'kubectl apply -f k8s-deployment.yaml'
                sh 'kubectl apply -f k8s-service.yaml'

            }
        }
    }
}