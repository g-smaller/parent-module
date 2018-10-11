package com.keng.boot.learning.web;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SpringBootWebIntegrationTest {

    @Autowired
    private ApplicationContext applicationContext;

    protected static RestTemplate restTemplate;

    @BeforeClass
    public static void setupRest() {
        restTemplate = new RestTemplate();
    }

    static class RestTemplateHelper {
        private String protocol;
        private String domain;
        private int port;
        private RestTemplate restTemplate;
        private String requestUri;
        private Map<String, Object> form = null;

        private RestTemplateHelper(String protocol, String domain, int port, RestTemplate restTemplate, String requestUri) {
            this.protocol = protocol;
            this.domain = domain;
            this.port = port;
            this.restTemplate = restTemplate;
        }

        public static RestTemplateHelper create(RestTemplate restTemplate, String requestUri) {
            return create("http", "localhost", 8080, restTemplate, requestUri);
        }

        public static RestTemplateHelper create(String protocol, String domain, int port, RestTemplate restTemplate, String requestUri) {
            return new RestTemplateHelper(protocol, domain, port, restTemplate, requestUri);
        }

        public RestTemplateHelper add(String k, byte... v) {
            Assert.hasLength(k, "参数名不能为空");
            if (v != null) {
                for (byte b : v) {
                    form.put(k, b);
                }
            }
            return this;
        }

        public RestTemplateHelper add(String k, short... v) {
            Assert.hasLength(k, "参数名不能为空");
            if (v != null) {
                for (short b : v) {
                    form.put(k, b);
                }
            }
            return this;
        }

        public RestTemplateHelper add(String k, int... v) {
            Assert.hasLength(k, "参数名不能为空");
            if (v != null) {
                for (int b : v) {
                    form.put(k, b);
                }
            }
            return this;
        }

        public RestTemplateHelper add(String k, long... v) {
            Assert.hasLength(k, "参数名不能为空");
            if (v != null) {
                for (long b : v) {
                    form.put(k, b);
                }
            }
            return this;
        }

        public RestTemplateHelper add(String k, double... v) {
            Assert.hasLength(k, "参数名不能为空");
            if (v != null) {
                for (double b : v) {
                    form.put(k, b);
                }
            }
            return this;
        }

        public RestTemplateHelper add(String k, float... v) {
            Assert.hasLength(k, "参数名不能为空");
            if (v != null) {
                for (float b : v) {
                    form.put(k, b);
                }
            }
            return this;
        }

        public RestTemplateHelper add(String k, String... v) {
            Assert.hasLength(k, "参数名不能为空");
            if (v != null) {
                for (String b : v) {
                    form.put(k, b);
                }
            }
            return this;
        }

        public <T> T get(Class<T> responseType) {
            return restTemplate.getForObject(getUrl(), responseType);
        }

        public <T> T post(Class<T> responseType) {
            return restTemplate.postForObject(getUrl(), null, responseType);
        }

        private String getUrl() {
            return protocol  + "://" + domain + (port > 0 ? ":" + port : "") + requestUri;
        }
    }

}
