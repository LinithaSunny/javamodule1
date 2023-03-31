package strategy.context;

import strategy.iface.ISocialMediaStrategy;

public class SocialMediaContext {

	ISocialMediaStrategy smStrategy;

	public void setSocialmediaStrategy(ISocialMediaStrategy smStrategy) {
		this.smStrategy = smStrategy;
	}

	public void connect(String name) {
		smStrategy.connectTo(name);
	}

}
