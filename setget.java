public class setget {
    public float s,p,l,t;

    public void setS(int s)
    {
        this.s=s;
    }
    public int getS(int s)
    {
        return s;
    }
    public void setl(float l)
    {
        this.l=l;
    }
    public float getl(float l)
    {
        return l;
    }
    public void setp(float p)
    {
        this.p=p;
    }
    public float getp(float p)
    {
        return p;
    }
    public void sett(float t)
    {
        this.t= t;
    }
    public float gett(float t)
    {
        return t;
    }
    public float luaslimas ()
    {
        float vol =p*l*t*1/3;
        return vol;

    }
}
