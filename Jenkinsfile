pipeline {
    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
        stage('discovery-service-Image') {
              dir ('discovery-service') {
                  def app = docker.build "localhost:5000/discovery-service"
                  app.push()
              }
          }

          stage ('discovery-service-Run') {
              docker.image("localhost:5000/discovery-service").run('-p 8761:8761 -h discovery-service --name discovery-service')
          }

          stage ('Final') {
              build job: 'cryptocurrencies-pipeline', wait: false
          }      

      
    }
}
