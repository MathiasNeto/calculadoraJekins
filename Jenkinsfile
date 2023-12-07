pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                bat('mvn clean package -DskipTests=true');
            }
        }
        stage('Deploy'){
            steps{
                deploy adapters: [tomcat9(credentialsId: 'TomcatLogin', path: '', url: 'http://localhost:9000/')], contextPath: null, war: 'target/Calculadora.war'
            }
        }
    }
}