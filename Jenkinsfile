node {
    withMaven() {    
        stage('build') {
                sh 'mvn --version'
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
