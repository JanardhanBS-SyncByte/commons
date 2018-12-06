package io.mosip.kernel.synchandler.constant;

public enum SyncConfigDetailsErrorCode {

	SYNC_CONFIG_DETAIL_REST_CLIENT_EXCEPTION("KER-SYNC-127","Error occured in service");
	
	private final String errorCode;
	private final String errorMessage;

	private SyncConfigDetailsErrorCode(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
	public String getErrorCode() {
		return this.errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}
}
