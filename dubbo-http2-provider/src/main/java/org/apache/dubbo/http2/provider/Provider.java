/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.http2.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * Prepare for start： <p>
 *
 *  1. clone dubbo and checkout branch
 *      git clone https://github.com/zonghaishang/dubbo.git
 *      cd dubbo
 *      git checkout prepare_for_http2
 *      mvn clean install -DskipTests -Dmaven.test.skip=true -Dmaven.javadoc.skip=true
 *
 *  2. clone http2 rpc protocol
 *      git clone https://github.com/zonghaishang/dubbo-rpc-http2.git
 *      cd dubbo-rpc-http2
 *      mvn clean install -DskipTests -Dmaven.test.skip=true -Dmaven.javadoc.skip=true
 *
 *  3. start Provider main, start Consumer main
 *
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        //Prevent to get IPV6 address,this way only work in debug mode
        //But you can pass use -Djava.net.preferIPv4Stack=true,then it work well whether in debug mode or not
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();

        System.in.read(); // press any key to exit
    }

}
