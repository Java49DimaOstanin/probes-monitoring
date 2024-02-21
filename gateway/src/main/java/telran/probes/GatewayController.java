package telran.probes;

import org.springframework.cloud.gateway.mvc.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import telran.probes.service.GatewaySevice;

@RestController
@RequiredArgsConstructor
public class GatewayController {
	final GatewaySevice gatewayService;
	@GetMapping("/**")
	ResponseEntity<byte[]> getProxy(ProxyExchange<byte[]> exchange, HttpServletRequest request){
		return gatewayService.proxyRouting(exchange, request, "Get");
	}
	@GetMapping("/**")
	ResponseEntity<byte[]> putProxy(ProxyExchange<byte[]> exchange, HttpServletRequest request){
		return gatewayService.proxyRouting(exchange, request, "Put");
	}
}
