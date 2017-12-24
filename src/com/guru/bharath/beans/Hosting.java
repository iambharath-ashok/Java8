/**
 * 
 */
package com.guru.bharath.beans;

/**
 * @author AB40286
 *
 */
public class Hosting {

	private int id;
	private String name;
	private Long websites;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the websites
	 */
	public Long getWebsites() {
		return websites;
	}

	/**
	 * @param websites
	 *            the websites to set
	 */
	public void setWebsites(Long websites) {
		this.websites = websites;
	}

	/**
	 * @param id
	 * @param name
	 * @param websites
	 */
	public Hosting(int id, String name, Long websites) {
		super();
		this.id = id;
		this.name = name;
		this.websites = websites;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Hosting [id=" + id + ", name=" + name + ", websites=" + websites + "]";
	}

}
