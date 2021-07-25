package com.BeBear.utils;

public class PageUtil {

	private int totalPage;

	private int firstPage;

	private int lastPage;

	public PageUtil() {

	}

	public PageUtil(int currentPage, int totalPage, int limitPage) {
		if (totalPage <= limitPage) {
			this.firstPage = 1;
			this.lastPage = totalPage;
		} else {

			// tinh firstPage
			this.firstPage = (currentPage - (int) (limitPage / 2));
			this.firstPage = this.firstPage > 0 ? this.firstPage : 1;

			// tinh lastPage
			this.lastPage = firstPage + limitPage - 1;
			this.lastPage = this.lastPage > totalPage ? totalPage : this.lastPage;
		}

		// totalPage
		this.totalPage = totalPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}
}
