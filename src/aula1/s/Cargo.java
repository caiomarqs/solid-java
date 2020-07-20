package aula1.s;

public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorcento()),
    DBA(new DezOuVintePorcento()),
    TESTER(new QuinzeOuVinteCincoPorcento());
    
	private RegraDeCalculo regra;
	
    private Cargo(RegraDeCalculo regra) {
    	this.regra = regra;
    }
    
    public RegraDeCalculo getRegra() {
    	return this.regra;
    }
}