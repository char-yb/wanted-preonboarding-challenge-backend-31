package com.commerce.global.error

class CustomException(
	val errorCode: ErrorCode,
) : RuntimeException(errorCode.message)