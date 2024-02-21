package telran.probes.service;

import org.springframework.cloud.gateway.mvc.ProxyExchange;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface GatewaySevice {
	ResponseEntity<byte[]> proxyRouting(ProxyExchange<byte[]> proxyExchange,HttpServletRequest request,String HttpMethod);
}
