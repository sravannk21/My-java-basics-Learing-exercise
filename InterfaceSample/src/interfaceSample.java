
public class interfaceSample implements interfaceFirst {
	public void onText(String name) {
		System.out.println(name);
	}
	interfaceSample(){
		interfaceSecond sec=new interfaceSecond(this);
		sec.scan();
	}
	public static void main(String ar[]) {
		interfaceSample inter=new interfaceSample();
	}
}