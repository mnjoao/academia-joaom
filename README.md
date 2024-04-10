Documentação do Projeto de Devops Infnet
Aluno João Marcos de Morais Neto
Este projeto consiste na implementação de um sistema utilizando Spring Boot. O sistema é composto por serviço de crud de alunos.


Utilize o Docker para criar uma imagem personalizada de alguma aplicação previamente feita por você. Publique a sua imagem no Dockerhub.: image
![image](https://github.com/mnjoao/academia-joaom/assets/55205843/2d1401a0-9851-4a14-a2bf-c18be9e60ca3)

Suba sua imagem em algum cluster kubernetes seguindo as seguintes especificações.: Utilize Deployment para subir sua aplicação com 4 réplicas. Exponha sua aplicação de modo que ela fique acessível fora do Cluster. (NODEPORT) Se sua aplicação fizer uso de banco de dados crie um POD com o mesmo e deixe-o acessível através do ClusterIP. Se sua aplicação não fizer uso de um BD suba uma imagem do Redis e crie um ClusterIP para o mesmo. Crie algum probe para sua aplicação (Readness ou Liveness.)
![img_kubernete_config](https://github.com/mnjoao/academia-joaom/assets/55205843/f97b982b-b993-4a22-a42e-70cb0060e6b4)
![img_kubernete_config2](https://github.com/mnjoao/academia-joaom/assets/55205843/4bcc6619-fc19-48ca-a80b-c2be21cad0b2)


Crie a estrutura para monitorar sua aplicação com o Prometheus e o Grafana (Ou qualquer ferramenta a sua escolha[Você deve ter um servidor de métricas e alguma ferramenta para dashboards.]) Apenas o Grafana deverá ficar acessível para fora do Cluster. Utilize um PVC para escrever os dados do Prometheus de maneira persistente. Crie dashboards do Grafana que exponha dados sensíveis da sua aplicação. (Memória, cpu, etc.)


Utilize o Jenkins (ou qualquer ferramenta) para criar um pipeline de entrega do seu projeto. Execute um stress test do seu projeto e tire print do Dashboard sofrendo alterações.


