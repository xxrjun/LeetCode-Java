import junit.runner.Version;

public class E278_FirstBadVersion{
    public int firstBadVersion(int n) {
        int l = 0, r = n;
        while(l < r){
            int mid = (l + r) / 2;
//            if(isBadVersion(mid)) r = mid;
//            else l = mid + 1;
        }

        return l;
    }
}
