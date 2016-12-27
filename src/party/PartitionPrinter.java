package party;

public class PartitionPrinter {

    private long conta = 0;

    public String printeP(long original) {
        String sub = "";
        conta = 0;
        for (long i = original ; i>0; i--) {
            sub+=printextP(original, i)+ ", ";
        }
        return sub;
    }

    private String printxP(long original, long request) {
        String sub = "";
        for (long i = original ; i>0; i--) {
            if( i <= request)
                sub+=request+" * " + printextP(original, i)+ "| ";
        }
        return sub;
    }

    private String printextP(long original, long request) {
        long diferente = original - request;
        if ( diferente <  0 ) return "erro";
        if ( diferente == 0 ) { contador(); return ""+ request; }
        if ( diferente == 1 ) { contador(); return request + " + 1 "; }
        return  printxP(diferente , request) ;

    }

    private void contador() {
        conta++;
    }
    public void contadorTotal() {
        System.out.println("\n-----------------------\n Contador: " + conta);
    }

    public long part(long n) {

        if (n<0) return 0;
        if (n==0) return 1;
        if (n<=3) return n;

        long i=0, j=0, p=0;
        long k, s;

        for (k=1,s=1;i<n||j<n;k++,s=-s) {

            i = (3*k*k-k)/2;
            j = (3*k*k+k)/2;

            p += (i<=n)?(s*part(n-i)):0;
            p += (j<=n)?(s*part(n-j)):0;

        }

        return p;

    }
}
