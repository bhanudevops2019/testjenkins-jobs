node('Jenkins_Slave'){
    stage('SHELL'){
        sh 'hostname'
    }
}