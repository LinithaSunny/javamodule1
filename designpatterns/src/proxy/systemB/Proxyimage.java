package proxy.systemB;
import proxy.iface.image;
import proxy.systemA.RealImage;

public class Proxyimage implements image {
	
	private final String filename;
	private RealImage image;

	public Proxyimage(String filename) {
		this.filename = filename;
	}

	public void showImage() {
		
		if (image == null) {
			image = new RealImage(filename);
		}
		image.showImage();
	}

}
