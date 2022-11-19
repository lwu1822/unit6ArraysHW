public class FRQ {

    public void addMembers(String[] names, int gradYear) {
        for (String memberName : names) {
            memberInfo member = new MemberInfo(memberName, gradYear, true);
            memberList.add(member);
        }
        
    }

    /* // this was an alternate solution that we did, which 
       // used a for loop instead of a for-each loop

    public void addMembers(String[] names, int gradYear) {
        for (int i = 0; i < names.length; i++) {
            memberInfo member = new MemberInfo(names[i], gradYear, true);
            memberList.add(member);
        }
        
    }
    */ 
}
