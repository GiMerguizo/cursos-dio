# Fundamentos de Cloud Computing com a AWS
## Serviços
### Amazon Elastic Compute (EC2)
Capacidade computacional segrura e redimensionável na nuvem
- Pagamento por uso

#### Amazon EC2 Systems Manager
Serviço de gerenciamento que ajuda na manutenção do EC2
- Automação

**SSM Agent:** software da Amazon que é instalado por padrão

### AWS Code Deploy
Automatizar a implantação de aplicações em ambientes de desenvolvimento (development), preparação (staging) e produção (production)

### AWS Elastic Beanstalk
- Plataforma como serviço (PaaS)
- Implantação rápida do seu serviço
- Reduz a complexidade do gerenciamento
- Suporte a várias plataformas
- Fornecerá todo o nível de serviço de aplicações
- Facilidade de implantação

### Amazon Elastic Container Registry (ECR)
Registro de imagens do Docker totalmente gerenciado
- Uso do S3 e IAM - garantindo alta disponibilidade e segurança
- **Contêiner:** uma unidade de entrega de software
    - Extremamente rápidos
    - Principal referência de software: _Docker_
    - Isolam software de seus arredores
    - Criação de **imagens** - contém o sistema de arquivos base que o contêiner verá quando for executado

### AWS Auto Scaling 
- Configuração de políticas de escalabilidade automática
- **Serviços:** EC2, ECS, DynamoDB, Aurora

### Amazon Elastic Load Balancer
#### Application Load Balancer
Segundo tipo de balanceador de carga do Elastic Load Balancing
- Supported Porotocols
    - HTTP, HTTPS, HTTP/2, WebSockets
- CloudWatch Metrics
    - Dimensões de métricas
    - Detalhes adicionais nos logs de acesso
- Access Logs
- Health Checks
Uso de contêineres para hospedar seus microsserviços e rotear para essas aplicações de um único balanceador de carga

### Amazon Elastic Container Service (ECS)
Serviço de gerenciamento de contêineres altamente escalável e de alto desempenho
- Suporte a contêineres do Docker
- Permite a execução de aplicativos facilmente
    - Altamente disponível
- Elástico e escalável
- Integração com outros serviços

**Cluster:** grupo de instâncias do Amazon EC2
- Onde os contêineres serão executados
- Gerenciamento de recursos
- Coordenação de ciclo de vida
- Programação eficiente

**Task:** agrupamento de contêineres
- Solicita ao Amazon ECS para executar os contêineres no cluster
- Instanciação de uma _task definition_ que executa todos os contêineres juntos
- Task Definition
    - Um ou mais contêineres que devem ser executados juntos, implantados como uma unidade 

**Service:** onde todas as funcionalidades estão conectadas juntas
- Gerenciamento das disponibilidades, escalabilidades e ciclo de vida
- Número mínimo e máximo desejado de tarefas
- Integração com o Auto Scaling


## Links
### AWS Official Content
:link: [Introduction to Amazon Elastic Compute Cloud (EC2)](https://cloud.contentraven.com/awspartners/DigitalInnovationOne/content-viewer/521560/1/11/0) <br>
:link: [Introduction to AWS Elastic Beanstalk](https://cloud.contentraven.com/awspartners/DigitalInnovationOne/content-viewer/521557/1/11/0) <br>
:link: [Introduction to Amazon EC2 Systems Manager](https://cloud.contentraven.com/awspartners/DigitalInnovationOne/content-viewer/521559/1/11/0) <br>
:link: [Introduction to Amazon Elastic Container Registry (Portuguese)](https://cloud.contentraven.com/awspartners/DigitalInnovationOne/content-viewer/521563/1/11/0) <br>
:link: [Introduction to AWS Auto Scaling](https://cloud.contentraven.com/awspartners/DigitalInnovationOne/content-viewer/521556/1/11/0) <br>
:link: [Introduction to Amazon Elastic Load Balancer](https://cloud.contentraven.com/awspartners/DigitalInnovationOne/content-viewer/521561/1/11/0)