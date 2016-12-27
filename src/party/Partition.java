package party;

public class Partition {

    private long conta = 0;

    public long value(long original) {
        conta = 0;
        for (long i = original ; i>0; i--) {
            extP(original, i);
        }
        return conta;
    }

    private void xP(long original, long request) {
        for (long i = original ; i>0; i--) {
            if( i <= request)
                extP(original, i);
        }
    }

    private void extP(long original, long request) {
        long diferente = original - request;
        if ( diferente <  0 ) { conta = -1; }
        else
        if ( diferente == 0 || diferente == 1) { conta++;}
        else
          xP(diferente , request) ;

    }



}
