import unittest

from fever_client.api.customers_api import CustomersApi

class TestCustomersApi(unittest.IsolatedAsyncioTestCase):

    async def asyncSetUp(self) -> None:
        self.api = CustomersApi()

    async def asyncTearDown(self) -> None:
        await self.api.api_client.close()

    async def test_reassign_customers_bulk(self) -> None:
        pass

if __name__ == '__main__':
    unittest.main()
