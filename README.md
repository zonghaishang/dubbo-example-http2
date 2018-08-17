# dubbo-rpc-http2 demo

## 1. clone dubbo and checkout branch
```
git clone https://github.com/zonghaishang/dubbo.git
cd dubbo
git checkout prepare_for_http2
mvn clean install -DskipTests -Dmaven.test.skip=true -Dmaven.javadoc.skip=true
```

## 2. clone http2 rpc protocol
```
git clone https://github.com/zonghaishang/dubbo-rpc-http2.git
cd dubbo-rpc-http2
mvn clean install -DskipTests -Dmaven.test.skip=true -Dmaven.javadoc.skip=true
```

## 3. start Provider main, start Consumer main
