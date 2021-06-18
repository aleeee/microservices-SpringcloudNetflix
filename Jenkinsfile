node {
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
              steps {
                 sh 'cd discovery-service'
                 sh 'docker build localhost:5000/discovery-service'
                  app.push()
              }
              }
          }

          stage ('discovery-service-Run') {
                steps {
              docker.image("localhost:5000/discovery-service").run('-p 8761:8761 -h discovery-service --name discovery-service')
                }
          }

          stage ('Final') {
                steps {
              build job: 'cryptocurrencies-pipeline', wait: false
                }
          }      

    
    }
}

