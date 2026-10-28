class Solution {
    public String simplifyPath(String path) {
        Stack<String> sta= new Stack<>();
        String[] st=path.split("/");

        for(String s: st){
            if(s.equals("")||s.equals(".")){
                continue;
            }
            if(s.equals("..")){
                if(!sta.isEmpty()){
                    sta.pop();
                }
            }else{
                sta.push(s);
            }
        }
        if(sta.isEmpty()){
            return "/";
        }

        StringBuilder  sb= new StringBuilder();

        for(String dir: sta){
            sb.append("/").append(dir);
        }

        return sb.toString();
    }
}