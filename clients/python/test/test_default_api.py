import unittest

from fever_client.api.default_api import DefaultApi

class TestDefaultApi(unittest.IsolatedAsyncioTestCase):

    async def asyncSetUp(self) -> None:
        self.api = DefaultApi()

    async def asyncTearDown(self) -> None:
        await self.api.api_client.close()

    async def test_health(self) -> None:
        pass

    async def test_healthz_healthz_get(self) -> None:
        pass

if __name__ == '__main__':
    unittest.main()
