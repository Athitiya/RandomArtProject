class ArtPanel extends Jpanel{
    
    public static final int size = 400;
    public final int numCol 2;
    private RandomExpression exp;
    
    public ArtPanel(){
        setSize(new Dimension(size,size));
        exp = new RandomExpression("random");
    }
    public String getExpressinInString(){
        String result = "Gray Scale Equation :"+exp.toString();
        return result;
    }
    public void paint(Graphics b){
        super.paint(b);
        Graphics2D b2 = (Graphics2D)b;
        RandomExpression randomExp1 = new RandomExpression();
        RandomExpression randomExp2 = new RandomExpression();
        RandomExpression randomExp3 = new RandomExpression();
        
        for(int i = 0;i<getWidth();i++){
            for(int j = 0; i<getHeight();j++){
                double x = ((((double)i)/getWidth())*2.0)-1.0;
                double y = ((((double)j)/getHeight())*2.0)-1.0;
                
                int red = (int)((randomExp1.getResult(x,y)+1)*(255/2));
                int blue = (int)((randomExp2.getResult(x,y)+1)*(255/2));
                int green = (int)((randomExp3.getResult(x,y)+1)*(255/2));
                b2.setColor(new Color(red,green,blue));
                b2.fillRect(i,j,i,j);
            }
        }
        
        
        
    }
        
}