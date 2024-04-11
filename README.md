<h1>Documentação do Projeto de Devops Infnet</h1>

Aluno João Marcos de Morais Neto

Este projeto consiste na implementação de um sistema utilizando Spring Boot. O sistema é composto por serviço de crud de alunos.

<h3>1.</h3>Utilize o Docker para criar uma imagem personalizada de alguma aplicação previamente feita por você. Publique a sua imagem no Dockerhub.:

![image](https://github.com/mnjoao/academia-joaom/assets/55205843/2d1401a0-9851-4a14-a2bf-c18be9e60ca3)

<h3>2.</h3>Suba sua imagem em algum cluster kubernetes seguindo as seguintes especificações.: Utilize Deployment para subir sua aplicação com 4 réplicas. Exponha sua aplicação de modo que ela fique acessível fora do Cluster. (NODEPORT) Se sua aplicação fizer uso de banco de dados crie um POD com o mesmo e deixe-o acessível através do ClusterIP. Se sua aplicação não fizer uso de um BD suba uma imagem do Redis e crie um ClusterIP para o mesmo. Crie algum probe para sua aplicação (Readness ou Liveness.)

![img_kubernete_config](https://github.com/mnjoao/academia-joaom/assets/55205843/f97b982b-b993-4a22-a42e-70cb0060e6b4)
![img_kubernete_config2](https://github.com/mnjoao/academia-joaom/assets/55205843/4bcc6619-fc19-48ca-a80b-c2be21cad0b2)

<h3>3.</h3>Crie a estrutura para monitorar sua aplicação com o Prometheus e o Grafana (Ou qualquer ferramenta a sua escolha[Você deve ter um servidor de métricas e alguma ferramenta para dashboards.]) Apenas o Grafana deverá ficar acessível para fora do Cluster. Utilize um PVC para escrever os dados do Prometheus de maneira persistente. Crie dashboards do Grafana que exponha dados sensíveis da sua aplicação. (Memória, cpu, etc.)

![Captura de tela 2024-04-10 184243](https://github.com/mnjoao/academia-joaom/assets/55205843/ff15a5c4-7070-4b75-a674-16eb19b6ee7d)
![image](https://github.com/mnjoao/academia-joaom/assets/55205843/872d6e57-e657-414d-b269-b761e85f3ac7)
![Captura de tela 2024-04-10 184133](https://github.com/mnjoao/academia-joaom/assets/55205843/10843866-9620-4689-9bc9-5cac4bdf8b28)
![dash grafana](https://github.com/mnjoao/academia-joaom/assets/55205843/5dfe7a2f-a628-4c89-8722-77920b0a67fe)

<h3>4.</h3> Utilize o Jenkins (ou qualquer ferramenta) para criar um pipeline de entrega do seu projeto.

![image](https://github.com/mnjoao/academia-joaom/assets/55205843/55d83107-a7aa-43b4-8b19-90ed4f44f29e)

<h3>5.</h3> Execute um stress test do seu projeto e tire print do Dashboard sofrendo alterações.

![image](https://github.com/mnjoao/academia-joaom/assets/55205843/d3dd7cef-9644-4c92-9107-695d3adf9364)

![image](https://github.com/mnjoao/academia-joaom/assets/55205843/cc2447d7-61cd-4e69-b479-7124b5f78195)
