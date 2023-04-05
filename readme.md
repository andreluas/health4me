<p align="center">
<img src = "src/assets/fiap.png" alt="fiap">
</p>

# <center>Health4Me 🗃️</center>

Este projeto é um serviço de pré atendimento para consultórios e hospitais, onde busca acelerar o processo de atendimento, de forma que o médico já tenha um pré diagnóstico do problema do paciente. Além disso realiza uma triagem no atendimento, identificando a urgência e apresentando um tempo estimado de espera, auxiliando a gestão hospitalar.

---
## 📝 Tecnologias
* Java 11
* Docker
* Postman

## 📄 Documentação 
Foi utilizado Swagger para realizar a documentação e modelagem dos endpoints do projeto, pensando em ajudar futuramente a utilização da API. Onde pode ser acessado na URI:
```
/swagger-ui/index.html
```

## 🧑‍💻 Como rodar o projeto
Após clonar o repositório em sua máquina rode o comando abaixo:
```
mvn spring-boot:run
```

## ⚗️ Build do projeto com Docker
Caso prefira é possível utilizar o docker para realizar o **build** do projeto, utilizando o arquivo Dockerfile no projeto para gerar a imagem, ou então utilizar o **maven** com o comando abaixo: 
```
mvn spring-boot:build-image
```
Após gerar a imagem, rode o comando:
```
docker run -p 8080:8080 health4me:0.0.1 .
```

## ✨ Postman
Utilize a collection _health4me-api.postman_ presente no projeto, para importar e testar os endpoints no Postman. 

___