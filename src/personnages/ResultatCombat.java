package personnages;

class ResultatCombat {
    String message;
    boolean reussi;

    public ResultatCombat(String message, boolean estCoupReussi) {
        this.message = message;
        this.reussi = estCoupReussi;
    }
    
    public String getMessage(){
    	return message;
    }
    
    public boolean getReussi(){
    	return reussi;
    }
}