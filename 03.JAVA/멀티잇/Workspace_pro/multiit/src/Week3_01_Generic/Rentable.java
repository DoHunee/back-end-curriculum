package Week3_01_Generic;


public interface Rentable<P>
{
        P rent();   //다양한 대상을 렌트하기 위해 rent()메소드의 리턴 타입을 타입파라미터로 선언
}
