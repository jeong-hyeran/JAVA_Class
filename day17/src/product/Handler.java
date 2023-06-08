package product;

import java.util.Arrays;
import java.util.Comparator;

public class Handler {
	
	Product[] arr = new Product[10];

	Object[] compArray = new Object[4];
	
	public Handler() {
		Comparator<Product> comp1 = (a, b) -> a != null && b != null ? a.name.compareTo(b.name) : 0;
		Comparator<Product> comp2 = (a, b) -> a != null && b != null ? b.name.compareTo(a.name) : 0;
		Comparator<Product> comp3 = (a, b) -> a != null && b != null ? a.price - b.price : 0;
		Comparator<Product> comp4 = (a, b) -> a != null && b != null ? b.price - a.price : 0;
		compArray[0] = comp1;
		compArray[1] = comp2;
		compArray[2] = comp3;
		compArray[3] = comp4;
	}
	// 전체 목록
	public Product[] selectAll() {
		return arr;
	}

	
	// 추가
	public int insert(Product tmp) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] =tmp;
				row =1;
				break;
			}
		}
		return row;
	}

	// 검색
	public Product[] search(String search) {
		Product[] ret = null;  //// 기존 배열을 넣을 수 없으니 새로운 배열을 생성해야한다.
		int length = 0;
		for (int i = 0; i < arr.length; i++) {
			Product p = arr[i];
			// 상품(p)의(.) 이름(name)이 검색어(search)를 포함(contains)하면
			if(p!=null&&p.name.contains(search)){
				length++;
			}
		}
		ret = new Product[length];
		length=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.contains(search)) {
				ret[length++] =arr[i];
			}
		}
		return ret;
	}

	// 삭제
	public int delete(String search) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(search)) {
				arr[i]=null;
				row+=1;
			}
		}
		
		return row;
	}

	// 정렬
//	@SuppressWarnings("unchecked")  // 타입이 확인 되지 않은 다운캐스팅에 대하여 경고를 억제한다.
	public Product[] sort(/*int option*/) {
		//1) 람다식 comparator
//		Arrays.sort(arr,(a,b)-> a!=null&& b!= null?a.name.compareTo(b.name):0);
		
		// 2) 익명 클래스
//		Arrays.sort(arr,new Comparator<Product>() {
//
//			@Override
//			public int compare(Product a, Product b) {
//				if(a != null && b!=null) {
//					return a.name.compareTo(b.name);
//				}
//				return 0;
//			}
//		});
		
		// 3)
//		if(0 <= option && option < compArray.length) {
//			Arrays.sort(arr,(Comparator<Product>)compArray[option]);
//		}
//		return arr;
//		
		
		
		///////////////
//		String [] arr1 = new String[6];
//		for (int i = 0; i < arr.length; i++) {
//				arr1[i]=arr[i];
//		}
//		
		//////////내가 한거/////////
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] != null && arr[j] != null && 
						arr[i].name.compareTo(arr[j].name) > 0) {
					Product tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
		///////////////////여기까지 성공한 코드/////////
		
//		Arrays.sort(arr,(a, b) -> b.price - a.price);
	}
	
	
	
	

	

	


}
