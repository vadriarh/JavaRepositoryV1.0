package eq;

import java.util.Date;

public class Company {
	private int UID;
	private Date since;
	private String name;

	public int getUID() {
		return UID;
	}

	public void setUID(int uID) {
		UID = uID;
	}

	public Date getSince() {
		return since;
	}

	public void setSince(Date since) {
		this.since = since;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + UID;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((since == null) ? 0 : since.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Company other = (Company) obj;
		if (UID != other.UID) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (since == null) {
			if (other.since != null) {
				return false;
			}
		} else if (!since.equals(other.since)) {
			return false;
		}
		return true;
	}

	
	

}
