### 快速开始

- #### docker运行
    - 执行`mvn clean package`
    - 执行`docker-compose up -d`
    - 浏览器访问`http://localhost/home`
    - 浏览器访问`http://localhost/bff-demo/demo?param=123`

- #### 后端demo运行

    - 执行`docker-compose up -d zookeeper`
    - 执行`mvn clean package`
    - 设置`jsy-cloud-api-demo/build/generated/source/proto/main/java`为`Sources Root`
    - 配置host `127.0.0.1  zookeeper`
    - 运行`JsyCloudBffDemoApplication`
    - 运行`JsyCloudProviderDemoApplication`
    - 浏览器访问`http://localhost:10001/bff-demo/demo?param=123`
