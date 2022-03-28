package com.oopsw;

public class IDString {
	
	private String StudentId;
	public IDString(String StudentId){
		this.StudentId=StudentId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((StudentId == null) ? 0 : StudentId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IDString other = (IDString) obj;
		if (StudentId == null) {
			if (other.StudentId != null)
				return false;
		} else if (!StudentId.equals(other.StudentId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "IDString [StudentId=" + StudentId + "]";
	}

	
	

}
