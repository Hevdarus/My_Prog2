package p2;

class OtherPackage{
	OtherPackage(){

		p1.Protection p = new p1.Protection();

		System.out.println("Other Package constructor");
	
		//System.out.println("n==" + p.n);
		//System.out.println("n_priv==" + p.n_priv);
		//System.out.println("n_prot==" + p.n_prot);
		System.out.println("n_pub==" + p.n_pub);
	}
}