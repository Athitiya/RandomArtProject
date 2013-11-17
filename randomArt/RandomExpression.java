class RandomExpression{
    
    private static final String operator = "O";
    private static final String singleOperator = "SO";
    private static final String operand = "OA";
    private final double probability;
    private String randomExpression;
    private final int expressionCom;
    private static final int defaultMax = 10;
    private static final double defaultPro = 0.85;
    
    public RandomExpression(){
        this(defaultMax,defaultPro);
    }
    public randomExpression(int complexity, double deep){
        expressionCom = complexity;
        probability = deep;
        do{
            randomExpression = createExpression(0);
            
        }while(!randomExpression.contains("x") || !randomExpression.contains("y"));
    }
    public RandomExpreesion(String c){
        expressionCom = -1;
        probability = -1;
        randomExpression = c;
    }
}