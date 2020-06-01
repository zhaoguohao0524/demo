package main.com.muyu.mianshiti.paixu;

/**
 * @author 赵先生
 * @date 2020/5/6 11:11
 *冒泡排序
 */
public class MaoPao {
    public static void main(String[] args) {
    int a[]={1,2,13,9,5,4,3,16};
    int i,j;
    //循环a.length-1：是当前数组的下标是从0开始的
    for (i=0;i<a.length-1;i++){
//
        for(j=0;j<a.length-1-i;j++){
            if (a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }

        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
    }
    }
}
