public class s {
    public int thirdMax(int[] nums) {
        Long oneNum=Long.MIN_VALUE;
        Long twoNum=Long.MIN_VALUE;
        Long three=Long.MIN_VALUE;
        for(int i:nums){
            if(oneNum>=i){
                if(twoNum>i && oneNum!=i){
                    if(three<i){
                        three=(long)i;
                    }
                }else if(twoNum<i && oneNum!=i){
                    three=twoNum;
                    twoNum=(long)i;
                }
            }else{
                three=twoNum;
                twoNum=oneNum;
                oneNum=(long)i;
            }
        }

        if(three!=Long.MIN_VALUE){
            return Math.toIntExact(three);
        }
        return Math.toIntExact(oneNum);
    }
}
