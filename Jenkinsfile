pipeline{
    agent any

    environment {
        DOCKER_IMAGE = "abkaplesh02/java-devops-app"
        VERSION="v3"
    }

    stages{

        stage('Clone Repo'){
            steps{
                checkout scm
            }
        }

        stage('Build Docker Image'){
            steps{
                sh 'docker build -t $DOCKER_IMAGE:$VERSION .'
            }
        }

        stage('Docker Login'){
            steps{
                withCredentials([usernamePassword(credentialsId: 'dockerhub-creds',
                usernameVariable: 'DOCKER_USER',
                passwordVariable: 'DOCKER_PASS')]){
                    sh 'echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin'
                }
            }
        }


        stage('Push Docker Image'){
            steps{
                sh 'docker push $DOCKER_IMAGE:$VERSION'
            }
        }

        stage('Deploy to kubernetes'){
            steps{
                sh 'kubectl apply -f k8s/';

            }
        }
    }
}