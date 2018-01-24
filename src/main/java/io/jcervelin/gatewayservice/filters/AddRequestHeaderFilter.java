package io.jcervelin.gatewayservice.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class AddRequestHeaderFilter extends ZuulFilter {

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		ctx.addZuulRequestHeader("x-location", "USA");
		return null; // PODE SER NULL MESMO PORQUE O RUN NÃO USA O RETORNO PARA NADA.
	}

	@Override
	public boolean shouldFilter() {
		return true; // default é falso. diz se devemos usar filtros ou não
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
