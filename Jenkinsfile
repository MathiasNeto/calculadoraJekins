pipeline{
    agent any
    stages{
        stage('Build'){
            sleep(3);
            steps{
                bat('mvn clean package -DskipTests=true');
            }
        }
    }
}