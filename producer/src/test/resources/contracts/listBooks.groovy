import org.springframework.cloud.contract.spec.Contract

Contract.make {
	request {
		method('GET')
		url('/books')
		headers { accept(applicationJson()) }
	}
	response {
		status(200)
		body(
				[
						[
								'name': "SomeBook",
								'isbn': '1231231231223'
						],
						[
								'name': "Fowler Book about Architecture",
								'isbn': '341245777757'
						],
				]
		)
	}
}
