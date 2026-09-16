import unittest

from fever_client.api.keys_api import KeysApi

class TestKeysApi(unittest.IsolatedAsyncioTestCase):

    async def asyncSetUp(self) -> None:
        self.api = KeysApi()

    async def asyncTearDown(self) -> None:
        await self.api.api_client.close()

    async def test_create_key(self) -> None:
        pass

    async def test_list_keys(self) -> None:
        pass

    async def test_revoke_key(self) -> None:
        pass

if __name__ == '__main__':
    unittest.main()
