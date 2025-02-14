/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.dinky.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@Configuration
public class WebSocketConfiguration implements WebSocketMessageBrokerConfigurer {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

    //    @Override
    //    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
    //        stompEndpointRegistry.addEndpoint("/stomp").setAllowedOrigins("*");
    //    }

    //    @Override
    //    public void configureMessageBroker(MessageBrokerRegistry registry) {
    //        registry.enableSimpleBroker("/topic", "/queue");
    //        registry.setApplicationDestinationPrefixes("/app");
    //        registry.setUserDestinationPrefix("/user");
    //        registry.setCacheLimit(1024 * 1024);
    //    }
}
