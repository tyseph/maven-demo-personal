package feb22.maven.demo.comparator;

import java.util.Comparator;

public class EmpCmpr implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getEid() - o2.getEid();
	}

}

class EmpEidCmpr implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getEid() - o2.getEid();
	}

}

class EmpSalaryCmpr implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		return Double.compare(o1.getSalary(), o2.getSalary());
	}

}

class EmpNameCmpr implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}

}