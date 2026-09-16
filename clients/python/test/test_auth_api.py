import unittest

from fever_client.api.auth_api import AuthApi

class TestAuthApi(unittest.IsolatedAsyncioTestCase):

    async def asyncSetUp(self) -> None:
        self.api = AuthApi()

    async def asyncTearDown(self) -> None:
        await self.api.api_client.close()

    async def test_whoami(self) -> None:
        pass

if __name__ == '__main__':
    unittest.main()
